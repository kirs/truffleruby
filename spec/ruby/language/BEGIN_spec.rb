require_relative '../spec_helper'

describe "The BEGIN keyword" do
  before :each do
    ScratchPad.record []
  end

  it "runs in a shared scope" do
    eval("BEGIN { var_in_begin = 'foo' }; var_in_begin").should == "foo"
  end

  it "accesses variables outside the eval scope" do
    outside_var = 'foo'
    eval("BEGIN { var_in_begin = outside_var }; var_in_begin").should == "foo"
  end

  it "must appear in a top-level context" do
    -> { eval "1.times { BEGIN { 1 } }" }.should raise_error(SyntaxError)
  end

  it "runs first in a given code unit" do
    eval "ScratchPad << 'foo'; BEGIN { ScratchPad << 'bar' }"

    ScratchPad.recorded.should == ['bar', 'foo']
  end

  it "runs multiple begins in FIFO order" do
    eval "BEGIN { ScratchPad << 'foo' }; BEGIN { ScratchPad << 'bar' }"

    ScratchPad.recorded.should == ['foo', 'bar']
  end

  it "returns the top-level script's filename for __FILE__" do
    ruby_exe(fixture(__FILE__, "begin_file.rb")).chomp.should =~ /begin_file\.rb$/
  end
end
