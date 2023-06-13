.class public final LSr6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aS\u0010\u000c\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001aM\u0010\u000f\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u00042\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "LOr6;",
        "VM",
        "Ljava/lang/Class;",
        "modelClass",
        "LXr6;",
        "viewModelStoreOwner",
        "",
        "key",
        "Landroidx/lifecycle/u$b;",
        "factory",
        "LFE0;",
        "extras",
        "b",
        "(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;",
        "javaClass",
        "a",
        "(LXr6;Ljava/lang/Class;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;)LOr6;",
        "lifecycle-viewmodel-compose_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,218:1\n31#2:219\n63#2,2:220\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n187#1:219\n187#1:220,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LXr6;Ljava/lang/Class;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;)LOr6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "LOr6;",
            ">(",
            "LXr6;",
            "Ljava/lang/Class<",
            "TVM;>;",
            "Ljava/lang/String;",
            "Landroidx/lifecycle/u$b;",
            "LFE0;",
            ")TVM;"
        }
    .end annotation

    if-eqz p3, :cond_0

    new-instance v0, Landroidx/lifecycle/u;

    invoke-interface {p0}, LXr6;->getViewModelStore()LWr6;

    move-result-object p0

    invoke-direct {v0, p0, p3, p4}, Landroidx/lifecycle/u;-><init>(LWr6;Landroidx/lifecycle/u$b;LFE0;)V

    goto :goto_0

    :cond_0
    instance-of p3, p0, Landroidx/lifecycle/e;

    if-eqz p3, :cond_1

    new-instance v0, Landroidx/lifecycle/u;

    invoke-interface {p0}, LXr6;->getViewModelStore()LWr6;

    move-result-object p3

    check-cast p0, Landroidx/lifecycle/e;

    invoke-interface {p0}, Landroidx/lifecycle/e;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/u$b;

    move-result-object p0

    invoke-direct {v0, p3, p0, p4}, Landroidx/lifecycle/u;-><init>(LWr6;Landroidx/lifecycle/u$b;LFE0;)V

    goto :goto_0

    :cond_1
    new-instance v0, Landroidx/lifecycle/u;

    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(LXr6;)V

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {v0, p2, p1}, Landroidx/lifecycle/u;->b(Ljava/lang/String;Ljava/lang/Class;)LOr6;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-virtual {v0, p1}, Landroidx/lifecycle/u;->a(Ljava/lang/Class;)LOr6;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method public static final b(Ljava/lang/Class;LXr6;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;LEt0;II)LOr6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "LOr6;",
            ">(",
            "Ljava/lang/Class<",
            "TVM;>;",
            "LXr6;",
            "Ljava/lang/String;",
            "Landroidx/lifecycle/u$b;",
            "LFE0;",
            "LEt0;",
            "II)TVM;"
        }
    .end annotation

    const-string p6, "modelClass"

    invoke-static {p0, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p6, -0x55ccaa39

    invoke-interface {p5, p6}, LEt0;->F(I)V

    and-int/lit8 p6, p7, 0x2

    if-eqz p6, :cond_1

    sget-object p1, Lpv2;->a:Lpv2;

    const/4 p6, 0x6

    invoke-virtual {p1, p5, p6}, Lpv2;->a(LEt0;I)LXr6;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    and-int/lit8 p6, p7, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move-object p2, v0

    :cond_2
    and-int/lit8 p6, p7, 0x8

    if-eqz p6, :cond_3

    move-object p3, v0

    :cond_3
    and-int/lit8 p6, p7, 0x10

    if-eqz p6, :cond_5

    instance-of p4, p1, Landroidx/lifecycle/e;

    if-eqz p4, :cond_4

    move-object p4, p1

    check-cast p4, Landroidx/lifecycle/e;

    invoke-interface {p4}, Landroidx/lifecycle/e;->getDefaultViewModelCreationExtras()LFE0;

    move-result-object p4

    goto :goto_1

    :cond_4
    sget-object p4, LFE0$a;->b:LFE0$a;

    :cond_5
    :goto_1
    invoke-static {p1, p0, p2, p3, p4}, LSr6;->a(LXr6;Ljava/lang/Class;Ljava/lang/String;Landroidx/lifecycle/u$b;LFE0;)LOr6;

    move-result-object p0

    invoke-interface {p5}, LEt0;->Q()V

    return-object p0
.end method
