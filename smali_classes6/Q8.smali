.class public final LQ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8;


# static fields
.field public static final b:LV46$b;


# instance fields
.field public final a:Lt32;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, LV46$b;->c:LV46$b;

    sput-object v0, LQ8;->b:LV46$b;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LQ8;->b:LV46$b;

    invoke-virtual {v0}, LV46$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lt32;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lt32;-><init>([BZ)V

    iput-object v0, p0, LQ8;->a:Lt32;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a([B[B)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const/16 v0, 0xc

    invoke-static {v0}, Ldn4;->c(I)[B

    move-result-object v0

    iget-object v1, p0, LQ8;->a:Lt32;

    invoke-virtual {v1, v0, p1, p2}, Lt32;->b([B[B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const/16 v0, 0xc

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, LQ8;->a:Lt32;

    invoke-virtual {v1, v0, p1, p2}, Lt32;->a([B[B[B)[B

    move-result-object p1

    return-object p1
.end method
