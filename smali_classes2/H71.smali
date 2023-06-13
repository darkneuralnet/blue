.class public final synthetic LH71;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LG71;


# direct methods
.method public synthetic constructor <init>(LG71;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH71;->b:LG71;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LH71;->b:LG71;

    invoke-static {v0}, LG71$h;->a(LG71;)V

    return-void
.end method
