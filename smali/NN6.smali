.class public final synthetic LNN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:Lbo/app/h1;


# direct methods
.method public synthetic constructor <init>(Lbo/app/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNN6;->b:Lbo/app/h1;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, LNN6;->b:Lbo/app/h1;

    invoke-static {v0, p1}, Lbo/app/h1;->b(Lbo/app/h1;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
