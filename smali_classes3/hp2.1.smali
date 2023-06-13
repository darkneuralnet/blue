.class public final synthetic Lhp2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;


# instance fields
.field public final synthetic b:Lfm5;


# direct methods
.method public synthetic constructor <init>(Lfm5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp2;->b:Lfm5;

    return-void
.end method


# virtual methods
.method public final handleResult(LbN4;)V
    .locals 1

    iget-object v0, p0, Lhp2;->b:Lfm5;

    invoke-static {v0, p1}, Lip2;->Pl(Lfm5;LbN4;)V

    return-void
.end method
