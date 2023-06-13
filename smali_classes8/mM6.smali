.class public abstract LmM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "****MagnesRequest****"

    iput-object v0, p0, LmM6;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-static {}, LYM6;->a()LYM6;

    move-result-object v0

    invoke-virtual {v0, p0}, LYM6;->b(LmM6;)V

    return-void
.end method
