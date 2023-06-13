.class public final LTO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LwM6<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwO6;


# direct methods
.method public constructor <init>(LwO6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTO6;->a:LwO6;

    return-void
.end method

.method public static c(LwO6;)Landroid/content/Context;
    .locals 0

    invoke-virtual {p0}, LwO6;->a()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, LpL6;->k(Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LTO6;->b()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LTO6;->a:LwO6;

    invoke-static {v0}, LTO6;->c(LwO6;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
