.class public LsD2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LsD2;


# instance fields
.field public final a:LvE2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvE2<",
            "Ljava/lang/String;",
            "LrD2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LsD2;

    invoke-direct {v0}, LsD2;-><init>()V

    sput-object v0, LsD2;->b:LsD2;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LvE2;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, LvE2;-><init>(I)V

    iput-object v0, p0, LsD2;->a:LvE2;

    return-void
.end method

.method public static b()LsD2;
    .locals 1

    sget-object v0, LsD2;->b:LsD2;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)LrD2;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LsD2;->a:LvE2;

    invoke-virtual {v0, p1}, LvE2;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LrD2;

    return-object p1
.end method

.method public c(Ljava/lang/String;LrD2;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LsD2;->a:LvE2;

    invoke-virtual {v0, p1, p2}, LvE2;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
