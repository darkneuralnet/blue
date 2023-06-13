.class public final Ljt3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lit3;


# instance fields
.field public final a:Lkt3;


# direct methods
.method public constructor <init>(Lkt3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljt3;->a:Lkt3;

    return-void
.end method

.method public static b(Lkt3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkt3;",
            ")",
            "LY94<",
            "Lit3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljt3;

    invoke-direct {v0, p0}, Ljt3;-><init>(Lkt3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)Lht3;
    .locals 1

    iget-object v0, p0, Ljt3;->a:Lkt3;

    invoke-virtual {v0, p1, p2, p3}, Lkt3;->b(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)Lht3;

    move-result-object p1

    return-object p1
.end method
