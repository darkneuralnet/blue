.class public final synthetic LkP2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LjP2;


# direct methods
.method public synthetic constructor <init>(LjP2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkP2;->b:LjP2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LkP2;->b:LjP2;

    invoke-static {v0}, LjP2$e;->a(LjP2;)V

    return-void
.end method
