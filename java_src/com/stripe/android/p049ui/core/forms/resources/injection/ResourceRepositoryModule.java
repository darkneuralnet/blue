package com.stripe.android.p049ui.core.forms.resources.injection;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;", "", "()V", "provideResources", "Landroid/content/res/Resources;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "providesLpmRepository", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "resources", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* renamed from: com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule */
/* loaded from: classes7.dex */
public final class ResourceRepositoryModule {
    public static final int $stable = 0;
    public static final ResourceRepositoryModule INSTANCE = new ResourceRepositoryModule();

    private ResourceRepositoryModule() {
    }

    @Provides
    public final Resources provideResources(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return resources;
    }

    @Provides
    public final LpmRepository providesLpmRepository(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return LpmRepository.Companion.getInstance(new LpmRepository.LpmRepositoryArguments(resources, null, 2, null));
    }
}
