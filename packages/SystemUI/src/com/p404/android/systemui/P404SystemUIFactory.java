package com.p404.android.systemui;

import android.content.Context;

import com.p404.android.systemui.dagger.P404GlobalRootComponent;
import com.p404.android.systemui.dagger.DaggerP404GlobalRootComponent;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class P404SystemUIFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerP404GlobalRootComponent.builder()
                .context(context)
                .build();
    }
}
