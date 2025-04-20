package com.veno_phage.neo_defense;

import net.minecraft.text.ClickEvent;

public class CRunnableClickEvent extends ClickEvent
{
    Runnable action;

    public CRunnableClickEvent(Runnable runnable)
    {
        super(null, null);
        this.action = runnable;
    }

    public void execute()
    {
        action.run();
    }
}