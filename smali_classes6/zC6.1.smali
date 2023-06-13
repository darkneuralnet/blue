.class public final synthetic LzC6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/firebase/messaging/g$a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/g$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzC6;->b:Lcom/google/firebase/messaging/g$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LzC6;->b:Lcom/google/firebase/messaging/g$a;

    invoke-static {v0}, Lcom/google/firebase/messaging/g$a;->a(Lcom/google/firebase/messaging/g$a;)V

    return-void
.end method
