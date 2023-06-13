.class public final Lcom/stripe/android/financialconnections/domain/GoNextKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/GoNextKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0000\u00a8\u0006\t"
    }
    d2 = {
        "toNavigationCommand",
        "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "args",
        "",
        "",
        "",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toNavigationCommand(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/core/Logger;Ljava/util/Map;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lcom/stripe/android/core/Logger;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/domain/GoNextKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->getValue()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unimplemented navigation command: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lkotlin/NotImplementedError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "An operation is not implemented: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    const-string p0, "Link not supported on native flows yet. Navigating to Success."

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-static {p1, p0, v0, p2, v0}, Lcom/stripe/android/core/Logger$DefaultImpls;->error$default(Lcom/stripe/android/core/Logger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    sget-object p0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getSuccess()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    goto :goto_0

    :pswitch_2
    sget-object p0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getReset()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    goto :goto_0

    :pswitch_3
    sget-object p0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getAttachLinkedPaymentAccount()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    goto :goto_0

    :pswitch_4
    sget-object p0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$ManualEntrySuccess;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections$ManualEntrySuccess;

    invoke-virtual {p0, p2}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$ManualEntrySuccess;->invoke(Ljava/util/Map;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    goto :goto_0

    :pswitch_5
    sget-object p0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getManualEntry()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    goto :goto_0

    :pswitch_6
    sget-object p0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getSuccess()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    goto :goto_0

    :pswitch_7
    sget-object p0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getAccountPicker()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    goto :goto_0

    :pswitch_8
    sget-object p0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getConsent()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    goto :goto_0

    :pswitch_9
    sget-object p0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getPartnerAuth()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    goto :goto_0

    :pswitch_a
    sget-object p0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getInstitutionPicker()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p0

    :goto_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
