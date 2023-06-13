.class public final synthetic LKO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lbo/app/w1;


# direct methods
.method public synthetic constructor <init>(Lbo/app/w1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKO6;->a:Lbo/app/w1;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LKO6;->a:Lbo/app/w1;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Lbo/app/o1;->g(Lbo/app/w1;Ljava/lang/Void;)V

    return-void
.end method
