.class public final synthetic LHq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LIq;


# direct methods
.method public synthetic constructor <init>(LIq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHq;->b:LIq;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LHq;->b:LIq;

    invoke-static {v0}, LIq;->b(LIq;)V

    return-void
.end method
