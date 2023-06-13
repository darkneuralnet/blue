.class public final synthetic LCY5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LFY5;


# direct methods
.method public synthetic constructor <init>(LFY5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCY5;->b:LFY5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LCY5;->b:LFY5;

    invoke-static {v0}, LFY5;->c(LFY5;)V

    return-void
.end method
