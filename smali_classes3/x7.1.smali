.class public final Lx7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lw7;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lx7;
    .locals 1

    invoke-static {}, Lx7$a;->a()Lx7;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lw7;
    .locals 1

    new-instance v0, Lw7;

    invoke-direct {v0}, Lw7;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lw7;
    .locals 1

    invoke-static {}, Lx7;->c()Lw7;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx7;->b()Lw7;

    move-result-object v0

    return-object v0
.end method
