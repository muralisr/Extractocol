/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ADefaultCaseLabel extends PCaseLabel
{
    private TDefault _default_;

    public ADefaultCaseLabel()
    {
        // Constructor
    }

    public ADefaultCaseLabel(
        @SuppressWarnings("hiding") TDefault _default_)
    {
        // Constructor
        setDefault(_default_);

    }

    @Override
    public Object clone()
    {
        return new ADefaultCaseLabel(
            cloneNode(this._default_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADefaultCaseLabel(this);
    }

    public TDefault getDefault()
    {
        return this._default_;
    }

    public void setDefault(TDefault node)
    {
        if(this._default_ != null)
        {
            this._default_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._default_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._default_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._default_ == child)
        {
            this._default_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._default_ == oldChild)
        {
            setDefault((TDefault) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
