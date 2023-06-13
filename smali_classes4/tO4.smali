.class public final LtO4;
.super LWS0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LWS0$c<",
        "LTD3<",
        "TK;TV;>;TV;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u00022\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u00010\u0004B#\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J \u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u00010\u0006H\u0016J\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\t0\t0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "LtO4;",
        "K",
        "",
        "V",
        "LWS0$c;",
        "LTD3;",
        "LWS0;",
        "d",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/RetryableContiguousDataSource;",
        "h",
        "LsO4;",
        "a",
        "LsO4;",
        "dataSourceDelegateFactory",
        "Lcom/uber/autodispose/ScopeProvider;",
        "b",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "LAG;",
        "kotlin.jvm.PlatformType",
        "c",
        "LAG;",
        "dataSource",
        "<init>",
        "(LsO4;Lcom/uber/autodispose/ScopeProvider;)V",
        "widget_release"
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
        "SMAP\nRetryablePageItemKeyedDataSourceFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetryablePageItemKeyedDataSourceFactory.kt\nco/bird/android/widget/paging/pageitem/RetryablePageItemKeyedDataSourceFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LsO4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsO4<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Lco/bird/android/model/RetryableContiguousDataSource;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LsO4;Lcom/uber/autodispose/ScopeProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsO4<",
            "TK;TV;>;",
            "Lcom/uber/autodispose/ScopeProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "dataSourceDelegateFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LWS0$c;-><init>()V

    iput-object p1, p0, LtO4;->a:LsO4;

    iput-object p2, p0, LtO4;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {}, LAG;->g()LAG;

    move-result-object p1

    const-string p2, "create<RetryableContiguousDataSource>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LtO4;->c:LAG;

    return-void
.end method


# virtual methods
.method public d()LWS0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LWS0<",
            "LTD3<",
            "TK;TV;>;TV;>;"
        }
    .end annotation

    new-instance v0, LnO4;

    iget-object v1, p0, LtO4;->a:LsO4;

    invoke-interface {v1}, LsO4;->create()LrO4;

    move-result-object v1

    iget-object v2, p0, LtO4;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-direct {v0, v1, v2}, LnO4;-><init>(LrO4;Lcom/uber/autodispose/ScopeProvider;)V

    iget-object v1, p0, LtO4;->c:LAG;

    invoke-virtual {v1, v0}, LAG;->accept(Ljava/lang/Object;)V

    sget-object v1, LtO4$a;->g:LtO4$a;

    invoke-virtual {v0, v1}, LEc2;->y(Lkotlin/jvm/functions/Function1;)LEc2;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/RetryableContiguousDataSource;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LtO4;->c:LAG;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "dataSource.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
