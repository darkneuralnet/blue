.class public final synthetic LuZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/widget/c;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuZ;->b:Lco/bird/android/widget/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LuZ;->b:Lco/bird/android/widget/c;

    invoke-static {v0}, Lco/bird/android/widget/c;->a5(Lco/bird/android/widget/c;)V

    return-void
.end method
