.class public final synthetic Lin4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/RangeSeekBar$c;


# instance fields
.field public final synthetic a:Lco/bird/android/widget/RangeFilterView;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/RangeFilterView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lin4;->a:Lco/bird/android/widget/RangeFilterView;

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/widget/RangeSeekBar;Ljava/lang/Number;Ljava/lang/Number;)V
    .locals 1

    iget-object v0, p0, Lin4;->a:Lco/bird/android/widget/RangeFilterView;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Integer;

    invoke-static {v0, p1, p2, p3}, Lco/bird/android/widget/RangeFilterView;->a(Lco/bird/android/widget/RangeFilterView;Lco/bird/android/widget/RangeSeekBar;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method
