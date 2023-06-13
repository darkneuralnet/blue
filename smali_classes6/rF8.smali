.class public final LrF8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LnG8;


# direct methods
.method public constructor <init>(LnG8;)V
    .locals 0

    iput-object p1, p0, LrF8;->b:LnG8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LrF8;->b:LnG8;

    invoke-static {v0}, LnG8;->n(LnG8;)LwE8;

    move-result-object v1

    iput-object v1, v0, LnG8;->e:LwE8;

    return-void
.end method
