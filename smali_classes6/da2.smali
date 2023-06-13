.class public Lda2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ92;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/le/ScanResult;)LY92;
    .locals 0

    invoke-static {p1}, Lca2;->a(Landroid/bluetooth/le/ScanResult;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LY92;->c:LY92;

    goto :goto_0

    :cond_0
    sget-object p1, LY92;->d:LY92;

    :goto_0
    return-object p1
.end method
