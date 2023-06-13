.class public final synthetic LG90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LF90$h$b;


# direct methods
.method public synthetic constructor <init>(LF90$h$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG90;->b:LF90$h$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LG90;->b:LF90$h$b;

    invoke-static {v0}, LF90$h$b;->a(LF90$h$b;)V

    return-void
.end method
