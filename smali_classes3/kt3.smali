.class public final Lkt3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lkt3;
    .locals 1

    new-instance v0, Lkt3;

    invoke-direct {v0}, Lkt3;-><init>()V

    return-object v0
.end method

.method public static c(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)Lht3;
    .locals 1

    new-instance v0, Lht3;

    invoke-direct {v0, p0, p1, p2}, Lht3;-><init>(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)Lht3;
    .locals 0

    invoke-static {p1, p2, p3}, Lkt3;->c(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)Lht3;

    move-result-object p1

    return-object p1
.end method
