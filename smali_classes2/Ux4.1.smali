.class public final synthetic LUx4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LVx4$a;

.field public final synthetic c:Lco/bird/android/model/RentalPlan;


# direct methods
.method public synthetic constructor <init>(LVx4$a;Lco/bird/android/model/RentalPlan;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUx4;->b:LVx4$a;

    iput-object p2, p0, LUx4;->c:Lco/bird/android/model/RentalPlan;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LUx4;->b:LVx4$a;

    iget-object v1, p0, LUx4;->c:Lco/bird/android/model/RentalPlan;

    invoke-static {v0, v1, p1}, LVx4$a;->a(LVx4$a;Lco/bird/android/model/RentalPlan;Landroid/view/View;)V

    return-void
.end method
