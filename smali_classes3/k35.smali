.class public final synthetic Lk35;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic b:Lco/bird/android/widget/ChipWithData;

.field public final synthetic c:Lo35;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/ChipWithData;Lo35;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk35;->b:Lco/bird/android/widget/ChipWithData;

    iput-object p2, p0, Lk35;->c:Lo35;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    iget-object v0, p0, Lk35;->b:Lco/bird/android/widget/ChipWithData;

    iget-object v1, p0, Lk35;->c:Lo35;

    invoke-static {v0, v1, p1, p2}, Lo35;->Tl(Lco/bird/android/widget/ChipWithData;Lo35;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
