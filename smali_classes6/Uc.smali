.class public final LUc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUc$b;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/String; = "Uc"


# instance fields
.field public final a:Lpl2;

.field public final b:Lp8;

.field public c:Lnl2;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LUc$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LUc$b;->a(LUc$b;)Lpl2;

    move-result-object v0

    iput-object v0, p0, LUc;->a:Lpl2;

    invoke-static {p1}, LUc$b;->b(LUc$b;)Lp8;

    move-result-object v0

    iput-object v0, p0, LUc;->b:Lp8;

    invoke-static {p1}, LUc$b;->c(LUc$b;)Lnl2;

    move-result-object p1

    iput-object p1, p0, LUc;->c:Lnl2;

    return-void
.end method

.method public synthetic constructor <init>(LUc$b;LUc$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0, p1}, LUc;-><init>(LUc$b;)V

    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    invoke-static {}, LUc;->d()Z

    move-result v0

    return v0
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, LUc;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public declared-synchronized c()Lll2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LUc;->c:Lnl2;

    invoke-virtual {v0}, Lnl2;->d()Lll2;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
