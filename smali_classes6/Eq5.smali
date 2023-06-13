.class public final synthetic LEq5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/material/search/a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/search/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEq5;->b:Lcom/google/android/material/search/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LEq5;->b:Lcom/google/android/material/search/a;

    invoke-static {v0}, Lcom/google/android/material/search/a;->c(Lcom/google/android/material/search/a;)V

    return-void
.end method
