.class public final synthetic LPB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LQB;


# direct methods
.method public synthetic constructor <init>(LQB;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPB;->b:LQB;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LPB;->b:LQB;

    invoke-static {v0}, LQB;->Pl(LQB;)V

    return-void
.end method
