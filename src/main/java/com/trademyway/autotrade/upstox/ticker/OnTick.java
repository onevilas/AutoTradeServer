package com.trademyway.autotrade.upstox.ticker;

import com.trademyway.autotrade.upstox.model.Tick;

import java.util.ArrayList;

/**
 * Callback to listen to ticker WebSocket on tick arrival event.
 */

public interface OnTick {
    void onTick(ArrayList<Tick> ticks);
}
