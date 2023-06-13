.class public final Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001ae\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000b\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0010\u0008\u0001\u0010\u0003\u0018\u0001*\u0008\u0012\u0004\u0012\u00028\u00020\u0002\"\n\u0008\u0002\u0010\u0005\u0018\u0001*\u00020\u0004*\u00028\u00002\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00062\u000e\u0008\u0006\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0080\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f\"\u0004\u0008\u0000\u0010\u000eH\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/activity/ComponentActivity;",
        "T",
        "LRN2;",
        "VM",
        "LAN2;",
        "S",
        "Lkotlin/reflect/KClass;",
        "viewModelClass",
        "Lkotlin/Function0;",
        "",
        "keyFactory",
        "Lkotlin/Lazy;",
        "viewModelLazy",
        "(Landroidx/activity/ComponentActivity;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;",
        "V",
        "Lkotlin/properties/ReadOnlyProperty;",
        "argsOrNull",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final argsOrNull()Lkotlin/properties/ReadOnlyProperty;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Lkotlin/properties/ReadOnlyProperty<",
            "Landroidx/activity/ComponentActivity;",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$argsOrNull$1;-><init>()V

    return-object v0
.end method

.method public static final synthetic viewModelLazy(Landroidx/activity/ComponentActivity;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/activity/ComponentActivity;",
            "VM:",
            "LRN2<",
            "TS;>;S::",
            "LAN2;",
            ">(TT;",
            "Lkotlin/reflect/KClass<",
            "TVM;>;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lkotlin/Lazy<",
            "TVM;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->needClassReification()V

    new-instance v0, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$2;

    invoke-direct {v0, p1, p0, p2}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$2;-><init>(Lkotlin/reflect/KClass;Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function0;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic viewModelLazy$default(Landroidx/activity/ComponentActivity;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lkotlin/Lazy;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x4

    const-string p4, "VM"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    const-class p1, LRN2;

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    new-instance p2, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$1;

    invoke-direct {p2, p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$1;-><init>(Lkotlin/reflect/KClass;)V

    :cond_1
    const-string p3, "<this>"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "viewModelClass"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "keyFactory"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->needClassReification()V

    new-instance p3, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$2;

    invoke-direct {p3, p1, p0, p2}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt$viewModelLazy$2;-><init>(Lkotlin/reflect/KClass;Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function0;)V

    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p0

    return-object p0
.end method
