.class public final synthetic LHX5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LJX5;


# direct methods
.method public synthetic constructor <init>(LJX5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHX5;->b:LJX5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LHX5;->b:LJX5;

    invoke-static {v0}, LJX5;->y(LJX5;)V

    return-void
.end method
