package com.nbfinal.androideatitv2client.EventBus;

import com.nbfinal.androideatitv2client.Model.BestDealModel;

public class BestDealItemClick {

    private BestDealModel bestDealModel;

    public BestDealItemClick(BestDealModel bestDealModel) {
        this.bestDealModel = bestDealModel;
    }

    public BestDealModel getBestDealModel() {
        return bestDealModel;
    }

    public void setBestDealModel(BestDealModel bestDealModel) {
        this.bestDealModel = bestDealModel;
    }
}
