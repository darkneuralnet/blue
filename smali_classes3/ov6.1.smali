.class public final Lov6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnv6;


# instance fields
.field public final a:Lqv6;


# direct methods
.method public constructor <init>(Lqv6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lov6;->a:Lqv6;

    return-void
.end method

.method public static a(Lqv6;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqv6;",
            ")",
            "LY94<",
            "Lnv6;",
            ">;"
        }
    .end annotation

    new-instance v0, Lov6;

    invoke-direct {v0, p0}, Lov6;-><init>(Lqv6;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create()Lfv6;
    .locals 1

    iget-object v0, p0, Lov6;->a:Lqv6;

    invoke-virtual {v0}, Lqv6;->b()Lfv6;

    move-result-object v0

    return-object v0
.end method
