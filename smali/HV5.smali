.class public final synthetic LHV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LMV5;


# direct methods
.method public synthetic constructor <init>(LMV5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHV5;->b:LMV5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LHV5;->b:LMV5;

    invoke-static {v0}, LMV5;->d(LMV5;)V

    return-void
.end method
