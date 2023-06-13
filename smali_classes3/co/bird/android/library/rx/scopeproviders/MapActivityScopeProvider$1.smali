.class public final Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFq2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;-><init>(Landroidx/lifecycle/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "co/bird/android/library/rx/scopeproviders/MapActivityScopeProvider$1",
        "LFq2;",
        "LLifecycleOwner;",
        "owner",
        "Landroidx/lifecycle/f$a;",
        "event",
        "",
        "onStateChanged",
        "rx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMapActivityScopeProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapActivityScopeProvider.kt\nco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;


# direct methods
.method public constructor <init>(Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider$1;->b:Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStateChanged(LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/l;
        value = .enum Landroidx/lifecycle/f$a;->ON_ANY:Landroidx/lifecycle/f$a;
    .end annotation

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/f$a;->ON_RESUME:Landroidx/lifecycle/f$a;

    if-ne p2, p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, LWJ2;->access$toMapLifecycleEvent(Landroidx/lifecycle/f$a;)LtK2;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider$1;->b:Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;

    invoke-virtual {p2, p1}, Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;->j(LtK2;)V

    :cond_1
    return-void
.end method
