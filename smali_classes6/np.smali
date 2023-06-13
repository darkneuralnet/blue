.class public final Lnp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnp$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:LK94$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LK94$a;->b:LK94$a;

    iput-object v0, p0, Lnp;->b:LK94$a;

    return-void
.end method

.method public static b()Lnp;
    .locals 1

    new-instance v0, Lnp;

    invoke-direct {v0}, Lnp;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()LK94;
    .locals 3

    new-instance v0, Lnp$a;

    iget v1, p0, Lnp;->a:I

    iget-object v2, p0, Lnp;->b:LK94$a;

    invoke-direct {v0, v1, v2}, Lnp$a;-><init>(ILK94$a;)V

    return-object v0
.end method

.method public c(I)Lnp;
    .locals 0

    iput p1, p0, Lnp;->a:I

    return-object p0
.end method
