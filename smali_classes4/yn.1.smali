.class public final synthetic Lyn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LFn;


# direct methods
.method public synthetic constructor <init>(LFn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyn;->b:LFn;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lyn;->b:LFn;

    invoke-static {v0}, LFn;->A1(LFn;)V

    return-void
.end method
