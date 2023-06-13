.class public final synthetic LLO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lbo/app/w1;


# direct methods
.method public synthetic constructor <init>(Lbo/app/w1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLO6;->a:Lbo/app/w1;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, LLO6;->a:Lbo/app/w1;

    invoke-static {v0, p1}, Lbo/app/o1;->e(Lbo/app/w1;Ljava/lang/Exception;)V

    return-void
.end method
