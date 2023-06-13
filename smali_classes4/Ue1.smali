.class public final synthetic LUe1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LVe1;


# direct methods
.method public synthetic constructor <init>(LVe1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUe1;->b:LVe1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LUe1;->b:LVe1;

    invoke-static {v0}, LVe1;->Ql(LVe1;)V

    return-void
.end method
