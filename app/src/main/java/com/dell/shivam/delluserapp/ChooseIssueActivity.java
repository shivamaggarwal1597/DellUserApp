package com.dell.shivam.delluserapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseIssueActivity extends AppCompatActivity {
    Button chat_admin,report_defect,report_refund;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_issue);
        chat_admin = (Button)findViewById(R.id.chat_with_admin_issue);
        report_defect = (Button)findViewById(R.id.report_a_defect_issue);
        report_refund=(Button)findViewById(R.id.process_refund_issue);
        chat_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseIssueActivity.this,IssuesActivity.class);
                startActivity(intent);
            }
        });
        report_refund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //TODO : Going to managing refund page
                //Taking input of service tag, same as below
                //Update need to be made
                //1.) In SetSellingDetailsActivity (Main pr oduct is edited for defect and refund information) and checked while editing information
                //2.) While searching devices, condition needs to be added
                //3.) While display request, condition needs to be checked
                //4.) Admin Side --> Send product back to market --> set everything to default and also clear data (from sell_in and sell_out node)
            }
        });
        report_defect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //TODO : Going to managing defect page
            //Taking input of service tag, then verifying its information(checking of sold_out,(not on display), no other request), then mentioning about the
            //type of defect in the system and the action performed regarding this information
            //Update need to be made
            //1.) In SetSellingDetailsActivity (Main product is edited for defect and refund information) and checked while editing information
            //2.) While searching devices, condition needs to be added
            //3.) While display request, condition needs to be checked
            //4.) Admin Side --> Send product back to market --> set everything to default and also clear data (from sell_in and sell_out node)
            }
        });
    }
}
