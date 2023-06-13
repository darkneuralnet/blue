.class public final synthetic LJb5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LKb5;


# direct methods
.method public synthetic constructor <init>(LKb5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJb5;->b:LKb5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LJb5;->b:LKb5;

    invoke-static {v0}, LKb5;->c(LKb5;)V

    return-void
.end method
