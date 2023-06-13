.class public final synthetic Lgl3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/RangeSeekBar$c;


# instance fields
.field public final synthetic a:Lfl3$c;

.field public final synthetic b:Lfl3;


# direct methods
.method public synthetic constructor <init>(Lfl3$c;Lfl3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgl3;->a:Lfl3$c;

    iput-object p2, p0, Lgl3;->b:Lfl3;

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/widget/RangeSeekBar;Ljava/lang/Number;Ljava/lang/Number;)V
    .locals 2

    iget-object v0, p0, Lgl3;->a:Lfl3$c;

    iget-object v1, p0, Lgl3;->b:Lfl3;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Integer;

    invoke-static {v0, v1, p1, p2, p3}, Lfl3$c;->a(Lfl3$c;Lfl3;Lco/bird/android/widget/RangeSeekBar;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method
