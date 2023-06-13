.class public final Lcom/stripe/android/core/injection/CoreCommonModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008H\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/core/injection/CoreCommonModule;",
        "",
        "()V",
        "provideLocale",
        "Ljava/util/Locale;",
        "provideLogger",
        "Lcom/stripe/android/core/Logger;",
        "enableLogging",
        "",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCoreCommonModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreCommonModule.kt\ncom/stripe/android/core/injection/CoreCommonModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideLocale()Ljava/util/Locale;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    invoke-static {}, Lvv2;->d()Lvv2;

    move-result-object v0

    invoke-virtual {v0}, Lvv2;->g()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lvv2;->c(I)Ljava/util/Locale;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public final provideLogger(Z)Lcom/stripe/android/core/Logger;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object p1

    return-object p1
.end method
