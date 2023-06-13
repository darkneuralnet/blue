.class public final synthetic LDY5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LFY5;

.field public final synthetic c:LqJ4;


# direct methods
.method public synthetic constructor <init>(LFY5;LqJ4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDY5;->b:LFY5;

    iput-object p2, p0, LDY5;->c:LqJ4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LDY5;->b:LFY5;

    iget-object v1, p0, LDY5;->c:LqJ4;

    invoke-static {v0, v1}, LFY5;->b(LFY5;LqJ4;)V

    return-void
.end method
