.class public final synthetic Lpu6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/J;


# instance fields
.field public final synthetic a:Landroid/widget/ScrollView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ScrollView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpu6;->a:Landroid/widget/ScrollView;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/H;)V
    .locals 1

    iget-object v0, p0, Lpu6;->a:Landroid/widget/ScrollView;

    invoke-static {v0, p1}, Lsu6;->b(Landroid/widget/ScrollView;Lio/reactivex/H;)V

    return-void
.end method
