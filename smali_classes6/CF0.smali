.class public final synthetic LCF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LDF0;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LDF0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCF0;->b:LDF0;

    iput-object p2, p0, LCF0;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LCF0;->b:LDF0;

    iget-object v1, p0, LCF0;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1}, LDF0;->a(LDF0;Ljava/lang/Runnable;)V

    return-void
.end method
