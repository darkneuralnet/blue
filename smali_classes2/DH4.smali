.class public final synthetic LDH4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LCH4;


# direct methods
.method public synthetic constructor <init>(LCH4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDH4;->b:LCH4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LDH4;->b:LCH4;

    invoke-static {v0}, LCH4$u;->a(LCH4;)V

    return-void
.end method
