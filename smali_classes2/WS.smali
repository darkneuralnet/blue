.class public final LWS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVS;


# instance fields
.field public final a:LXS;


# direct methods
.method public constructor <init>(LXS;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWS;->a:LXS;

    return-void
.end method

.method public static b(LXS;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXS;",
            ")",
            "LY94<",
            "LVS;",
            ">;"
        }
    .end annotation

    new-instance v0, LWS;

    invoke-direct {v0, p0}, LWS;-><init>(LXS;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/ScanBarcodeExtra;LZS;Le13;ZZ)LSS;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/model/extra/ScanBarcodeExtra;",
            "LZS;",
            "Le13;",
            "ZZ)",
            "LSS;"
        }
    .end annotation

    iget-object v0, p0, LWS;->a:LXS;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, LXS;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/ScanBarcodeExtra;LZS;Le13;ZZ)LSS;

    move-result-object p1

    return-object p1
.end method
