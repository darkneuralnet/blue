.class public final synthetic LV12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/stripe3ds2/views/InformationZoneView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV12;->b:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LV12;->b:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    invoke-static {v0, p1}, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->c(Lcom/stripe/android/stripe3ds2/views/InformationZoneView;Landroid/view/View;)V

    return-void
.end method
