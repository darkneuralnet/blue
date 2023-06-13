.class public final synthetic LS64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LX64;


# direct methods
.method public synthetic constructor <init>(LX64;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS64;->b:LX64;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LS64;->b:LX64;

    invoke-static {v0}, LX64;->l(LX64;)V

    return-void
.end method
