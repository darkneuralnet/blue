.class public final synthetic LjL1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LsL1;


# direct methods
.method public synthetic constructor <init>(LsL1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjL1;->b:LsL1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LjL1;->b:LsL1;

    invoke-static {v0}, LsL1;->a(LsL1;)V

    return-void
.end method
